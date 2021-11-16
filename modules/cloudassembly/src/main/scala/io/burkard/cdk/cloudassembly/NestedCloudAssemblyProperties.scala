package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NestedCloudAssemblyProperties {

  def apply(
    directoryName: String,
    displayName: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties =
    (new software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.Builder)
      .directoryName(directoryName)
      .displayName(displayName.orNull)
      .build()
}
