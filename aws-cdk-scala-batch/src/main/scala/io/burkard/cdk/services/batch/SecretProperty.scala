package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretProperty {

  def apply(
    name: Option[String] = None,
    valueFrom: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty.Builder)
      .name(name.orNull)
      .valueFrom(valueFrom.orNull)
      .build()
}
