package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NestedCloudAssemblyProperties {

  def apply(
    displayName: Option[String] = None,
    directoryName: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties =
    (new software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.Builder)
      .displayName(displayName.orNull)
      .directoryName(directoryName.orNull)
      .build()
}
