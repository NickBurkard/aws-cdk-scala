package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SerdeInfoProperty {

  def apply(
    serializationLibrary: Option[String] = None,
    name: Option[String] = None,
    parameters: Option[AnyRef] = None
  ): software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty.Builder)
      .serializationLibrary(serializationLibrary.orNull)
      .name(name.orNull)
      .parameters(parameters.orNull)
      .build()
}
