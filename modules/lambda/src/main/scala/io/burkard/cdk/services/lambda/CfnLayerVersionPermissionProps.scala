package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersionPermissionProps {

  def apply(
    layerVersionArn: String,
    principal: String,
    action: String,
    organizationId: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps =
    (new software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder)
      .layerVersionArn(layerVersionArn)
      .principal(principal)
      .action(action)
      .organizationId(organizationId.orNull)
      .build()
}
