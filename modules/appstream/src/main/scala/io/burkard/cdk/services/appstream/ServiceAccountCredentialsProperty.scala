package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAccountCredentialsProperty {

  def apply(
    accountName: Option[String] = None,
    accountPassword: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty =
    (new software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder)
      .accountName(accountName.orNull)
      .accountPassword(accountPassword.orNull)
      .build()
}
