package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelV2Props {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    apiId: Option[String] = None,
    schema: Option[AnyRef] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnModelV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnModelV2Props.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .apiId(apiId.orNull)
      .schema(schema.orNull)
      .contentType(contentType.orNull)
      .build()
}
