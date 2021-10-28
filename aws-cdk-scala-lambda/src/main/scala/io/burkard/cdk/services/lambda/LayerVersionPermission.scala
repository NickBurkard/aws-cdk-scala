package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LayerVersionPermission {

  def apply(
    accountId: Option[String] = None,
    organizationId: Option[String] = None
  ): software.amazon.awscdk.services.lambda.LayerVersionPermission =
    (new software.amazon.awscdk.services.lambda.LayerVersionPermission.Builder)
      .accountId(accountId.orNull)
      .organizationId(organizationId.orNull)
      .build()
}
