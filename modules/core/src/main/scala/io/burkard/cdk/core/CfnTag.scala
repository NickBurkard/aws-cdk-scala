package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTag {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.CfnTag =
    (new software.amazon.awscdk.CfnTag.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
