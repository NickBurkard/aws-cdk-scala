package io.burkard.cdk.cloudassembly


sealed abstract class ArtifactType(val underlying: software.amazon.awscdk.cloudassembly.schema.ArtifactType)
  extends Product
    with Serializable


object ArtifactType {
  implicit def toAws(value: ArtifactType): software.amazon.awscdk.cloudassembly.schema.ArtifactType =
    Option(value).map(_.underlying).orNull

  case object None
    extends ArtifactType(software.amazon.awscdk.cloudassembly.schema.ArtifactType.NONE)

  case object AwsCloudformationStack
    extends ArtifactType(software.amazon.awscdk.cloudassembly.schema.ArtifactType.AWS_CLOUDFORMATION_STACK)

  case object CdkTree
    extends ArtifactType(software.amazon.awscdk.cloudassembly.schema.ArtifactType.CDK_TREE)

  case object AssetManifest
    extends ArtifactType(software.amazon.awscdk.cloudassembly.schema.ArtifactType.ASSET_MANIFEST)

  case object NestedCloudAssembly
    extends ArtifactType(software.amazon.awscdk.cloudassembly.schema.ArtifactType.NESTED_CLOUD_ASSEMBLY)
}
