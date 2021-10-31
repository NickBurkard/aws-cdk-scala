package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGraphQLSchemaProps {

  def apply(
    definitionS3Location: Option[String] = None,
    apiId: Option[String] = None,
    definition: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder)
      .definitionS3Location(definitionS3Location.orNull)
      .apiId(apiId.orNull)
      .definition(definition.orNull)
      .build()
}
