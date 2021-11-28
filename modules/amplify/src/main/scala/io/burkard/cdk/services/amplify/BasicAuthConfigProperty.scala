package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicAuthConfigProperty {

  def apply(
    username: String,
    password: String,
    enableBasicAuth: Option[Boolean] = None
  ): software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty =
    (new software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty.Builder)
      .username(username)
      .password(password)
      .enableBasicAuth(enableBasicAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
