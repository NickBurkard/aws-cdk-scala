package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MultipartUserDataOptions {

  def apply(
    partsSeparator: Option[String] = None
  ): software.amazon.awscdk.services.ec2.MultipartUserDataOptions =
    (new software.amazon.awscdk.services.ec2.MultipartUserDataOptions.Builder)
      .partsSeparator(partsSeparator.orNull)
      .build()
}
