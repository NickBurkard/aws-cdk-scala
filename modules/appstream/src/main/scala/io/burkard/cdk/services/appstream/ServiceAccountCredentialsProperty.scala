package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAccountCredentialsProperty {

  def apply(
    accountName: String,
    accountPassword: String
  ): software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty =
    (new software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder)
      .accountName(accountName)
      .accountPassword(accountPassword)
      .build()
}
