package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SerdeInfoProperty {

  def apply(
    serializationLibrary: Option[String] = None,
    name: Option[String] = None,
    parameters: Option[AnyRef] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty.Builder)
      .serializationLibrary(serializationLibrary.orNull)
      .name(name.orNull)
      .parameters(parameters.orNull)
      .build()
}
