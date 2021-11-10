package io.burkard.cdk.cloudassembly


sealed abstract class ArtifactMetadataEntryType(val underlying: software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType)
  extends Product
    with Serializable


object ArtifactMetadataEntryType {
  implicit def toAws(value: ArtifactMetadataEntryType): software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType =
    Option(value).map(_.underlying).orNull

  case object Asset
    extends ArtifactMetadataEntryType(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.ASSET)

  case object Info
    extends ArtifactMetadataEntryType(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.INFO)

  case object Warn
    extends ArtifactMetadataEntryType(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.WARN)

  case object Error
    extends ArtifactMetadataEntryType(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.ERROR)

  case object LogicalId
    extends ArtifactMetadataEntryType(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.LOGICAL_ID)

  case object StackTags
    extends ArtifactMetadataEntryType(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.STACK_TAGS)
}
