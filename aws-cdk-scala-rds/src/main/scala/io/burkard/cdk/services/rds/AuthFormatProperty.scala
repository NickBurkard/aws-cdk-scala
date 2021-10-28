package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthFormatProperty {

  def apply(
    iamAuth: Option[String] = None,
    description: Option[String] = None,
    authScheme: Option[String] = None,
    userName: Option[String] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty =
    (new software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.Builder)
      .iamAuth(iamAuth.orNull)
      .description(description.orNull)
      .authScheme(authScheme.orNull)
      .userName(userName.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
