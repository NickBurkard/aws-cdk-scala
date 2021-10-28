package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserAttributes {

  def apply(
    userArn: Option[String] = None
  ): software.amazon.awscdk.services.iam.UserAttributes =
    (new software.amazon.awscdk.services.iam.UserAttributes.Builder)
      .userArn(userArn.orNull)
      .build()
}
