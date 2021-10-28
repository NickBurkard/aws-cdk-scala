package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetManifestProperties {

  def apply(
    requiresBootstrapStackVersion: Option[Number] = None,
    file: Option[String] = None,
    bootstrapStackVersionSsmParameter: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties =
    (new software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties.Builder)
      .requiresBootstrapStackVersion(requiresBootstrapStackVersion.orNull)
      .file(file.orNull)
      .bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter.orNull)
      .build()
}
