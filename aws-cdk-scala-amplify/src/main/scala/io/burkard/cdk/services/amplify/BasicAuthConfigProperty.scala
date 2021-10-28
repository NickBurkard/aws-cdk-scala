package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BasicAuthConfigProperty {

  def apply(
    username: Option[String] = None,
    enableBasicAuth: Option[Boolean] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty =
    (new software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty.Builder)
      .username(username.orNull)
      .enableBasicAuth(enableBasicAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .password(password.orNull)
      .build()
}
