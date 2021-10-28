package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudAssemblyBuilderProps {

  def apply(
    parentBuilder: Option[software.amazon.awscdk.cxapi.CloudAssemblyBuilder] = None,
    assetOutdir: Option[String] = None
  ): software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps =
    (new software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps.Builder)
      .parentBuilder(parentBuilder.orNull)
      .assetOutdir(assetOutdir.orNull)
      .build()
}
