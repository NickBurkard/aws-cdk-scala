package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudAssemblyBuilder {

  def apply(
    parentBuilder: Option[software.amazon.awscdk.cxapi.CloudAssemblyBuilder] = None,
    assetOutdir: Option[String] = None
  ): software.amazon.awscdk.cxapi.CloudAssemblyBuilder =
    software.amazon.awscdk.cxapi.CloudAssemblyBuilder.Builder
      .create()
      .parentBuilder(parentBuilder.orNull)
      .assetOutdir(assetOutdir.orNull)
      .build()
}
