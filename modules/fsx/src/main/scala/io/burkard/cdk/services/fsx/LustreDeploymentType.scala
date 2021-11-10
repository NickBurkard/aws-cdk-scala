package io.burkard.cdk.services.fsx


sealed abstract class LustreDeploymentType(val underlying: software.amazon.awscdk.services.fsx.LustreDeploymentType)
  extends Product
    with Serializable


object LustreDeploymentType {
  implicit def toAws(value: LustreDeploymentType): software.amazon.awscdk.services.fsx.LustreDeploymentType =
    Option(value).map(_.underlying).orNull

  case object Scratch1
    extends LustreDeploymentType(software.amazon.awscdk.services.fsx.LustreDeploymentType.SCRATCH_1)

  case object Scratch2
    extends LustreDeploymentType(software.amazon.awscdk.services.fsx.LustreDeploymentType.SCRATCH_2)

  case object Persistent1
    extends LustreDeploymentType(software.amazon.awscdk.services.fsx.LustreDeploymentType.PERSISTENT_1)
}
