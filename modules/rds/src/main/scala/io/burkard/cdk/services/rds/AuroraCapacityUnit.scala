package io.burkard.cdk.services.rds

sealed abstract class AuroraCapacityUnit(val underlying: software.amazon.awscdk.services.rds.AuroraCapacityUnit)
  extends Product
    with Serializable

object AuroraCapacityUnit {
  implicit def toAws(value: AuroraCapacityUnit): software.amazon.awscdk.services.rds.AuroraCapacityUnit =
    Option(value).map(_.underlying).orNull

  case object Acu1
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_1)

  case object Acu2
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_2)

  case object Acu4
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_4)

  case object Acu8
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_8)

  case object Acu16
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_16)

  case object Acu32
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_32)

  case object Acu64
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_64)

  case object Acu128
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_128)

  case object Acu192
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_192)

  case object Acu256
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_256)

  case object Acu384
    extends AuroraCapacityUnit(software.amazon.awscdk.services.rds.AuroraCapacityUnit.ACU_384)
}
