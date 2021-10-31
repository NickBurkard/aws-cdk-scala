package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaaRecordValue {

  def apply(
    tag: Option[software.amazon.awscdk.services.route53.CaaTag] = None,
    flag: Option[Number] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.route53.CaaRecordValue =
    (new software.amazon.awscdk.services.route53.CaaRecordValue.Builder)
      .tag(tag.orNull)
      .flag(flag.orNull)
      .value(value.orNull)
      .build()
}
