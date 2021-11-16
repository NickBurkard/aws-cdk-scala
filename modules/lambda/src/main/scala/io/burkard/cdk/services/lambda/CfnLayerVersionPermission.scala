package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersionPermission {

  def apply(
    internalResourceId: String,
    layerVersionArn: String,
    principal: String,
    action: String,
    organizationId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnLayerVersionPermission =
    software.amazon.awscdk.services.lambda.CfnLayerVersionPermission.Builder
      .create(stackCtx, internalResourceId)
      .layerVersionArn(layerVersionArn)
      .principal(principal)
      .action(action)
      .organizationId(organizationId.orNull)
      .build()
}
