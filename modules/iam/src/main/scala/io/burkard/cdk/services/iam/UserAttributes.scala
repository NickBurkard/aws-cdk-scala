package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserAttributes {

  def apply(
    userArn: String
  ): software.amazon.awscdk.services.iam.UserAttributes =
    (new software.amazon.awscdk.services.iam.UserAttributes.Builder)
      .userArn(userArn)
      .build()
}
