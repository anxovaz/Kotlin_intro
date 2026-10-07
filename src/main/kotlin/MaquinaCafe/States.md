# Maquina de estados

Máquina de estados de una máquina de café. El usuario introduce monedas,
selecciona un café y la máquina avanza por los estados de preparación y entrega.

```mermaid
flowchart TD
    Idle["estado = Idle"] --> CoinsCheck
    CoinsCheck@{ shape: inv-tri, label: "coins.wage() >= 0.60" }
    CoinsCheck -->|Sí| MakeCofee["estado = MakeCofee"]
    CoinsCheck -->|No| Idle
    MakeCofee -->|Cofee preparado| ServeCofee["estado = ServeCofee"]
    MakeCofee -->|Error durante la preparación| Error["estado = error"]
    ServeCofee -->|Cofee servido / Coins.returncoins(change)| Idle
    Error -->|Reiniciar o cancelar| Idle
```
