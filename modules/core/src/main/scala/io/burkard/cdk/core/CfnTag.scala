package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTag {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.CfnTag =
    (new software.amazon.awscdk.CfnTag.Builder)
      .key(key)
      .value(value)
      .build()
}
