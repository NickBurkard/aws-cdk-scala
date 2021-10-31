package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SsmParameterImageOptions {

  def apply(
    cachedInContext: Option[Boolean] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    os: Option[software.amazon.awscdk.services.ec2.OperatingSystemType] = None
  ): software.amazon.awscdk.services.ec2.SsmParameterImageOptions =
    (new software.amazon.awscdk.services.ec2.SsmParameterImageOptions.Builder)
      .cachedInContext(cachedInContext.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userData(userData.orNull)
      .os(os.orNull)
      .build()
}
