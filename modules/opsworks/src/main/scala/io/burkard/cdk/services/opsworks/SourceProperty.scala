package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceProperty {

  def apply(
    url: Option[String] = None,
    username: Option[String] = None,
    sshKey: Option[String] = None,
    revision: Option[String] = None,
    `type`: Option[String] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty =
    (new software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder)
      .url(url.orNull)
      .username(username.orNull)
      .sshKey(sshKey.orNull)
      .revision(revision.orNull)
      .`type`(`type`.orNull)
      .password(password.orNull)
      .build()
}
