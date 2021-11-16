package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaaRecordValue {

  def apply(
    tag: software.amazon.awscdk.services.route53.CaaTag,
    flag: Number,
    value: String
  ): software.amazon.awscdk.services.route53.CaaRecordValue =
    (new software.amazon.awscdk.services.route53.CaaRecordValue.Builder)
      .tag(tag)
      .flag(flag)
      .value(value)
      .build()
}
