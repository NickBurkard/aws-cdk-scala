package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretProperty {

  def apply(
    name: String,
    valueFrom: String
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty.Builder)
      .name(name)
      .valueFrom(valueFrom)
      .build()
}
