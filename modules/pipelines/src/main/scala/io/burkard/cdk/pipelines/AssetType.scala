package io.burkard.cdk.pipelines


sealed abstract class AssetType(val underlying: software.amazon.awscdk.pipelines.AssetType)
  extends Product
    with Serializable


object AssetType {
  implicit def toAws(value: AssetType): software.amazon.awscdk.pipelines.AssetType =
    Option(value).map(_.underlying).orNull

  case object File
    extends AssetType(software.amazon.awscdk.pipelines.AssetType.FILE)

  case object DockerImage
    extends AssetType(software.amazon.awscdk.pipelines.AssetType.DOCKER_IMAGE)
}
