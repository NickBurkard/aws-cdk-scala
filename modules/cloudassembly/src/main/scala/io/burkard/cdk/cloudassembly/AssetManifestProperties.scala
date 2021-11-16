package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetManifestProperties {

  def apply(
    file: String,
    requiresBootstrapStackVersion: Option[Number] = None,
    bootstrapStackVersionSsmParameter: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties =
    (new software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties.Builder)
      .file(file)
      .requiresBootstrapStackVersion(requiresBootstrapStackVersion.orNull)
      .bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter.orNull)
      .build()
}
