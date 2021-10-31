package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Attribute {

  def apply(
    name: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.dynamodb.AttributeType] = None
  ): software.amazon.awscdk.services.dynamodb.Attribute =
    (new software.amazon.awscdk.services.dynamodb.Attribute.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .build()
}
