package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ZoneDelegationOptions {

  def apply(
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.route53.ZoneDelegationOptions =
    (new software.amazon.awscdk.services.route53.ZoneDelegationOptions.Builder)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .build()
}
