package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGraphQLSchema {

  def apply(
    internalResourceId: String,
    apiId: String,
    definitionS3Location: Option[String] = None,
    definition: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnGraphQLSchema =
    software.amazon.awscdk.services.appsync.CfnGraphQLSchema.Builder
      .create(stackCtx, internalResourceId)
      .apiId(apiId)
      .definitionS3Location(definitionS3Location.orNull)
      .definition(definition.orNull)
      .build()
}
