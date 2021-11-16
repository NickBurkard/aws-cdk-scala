package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LayerVersionPermission {

  def apply(
    accountId: String,
    organizationId: Option[String] = None
  ): software.amazon.awscdk.services.lambda.LayerVersionPermission =
    (new software.amazon.awscdk.services.lambda.LayerVersionPermission.Builder)
      .accountId(accountId)
      .organizationId(organizationId.orNull)
      .build()
}
