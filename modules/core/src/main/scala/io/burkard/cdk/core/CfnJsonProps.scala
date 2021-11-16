package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJsonProps {

  def apply(
    value: AnyRef
  ): software.amazon.awscdk.CfnJsonProps =
    (new software.amazon.awscdk.CfnJsonProps.Builder)
      .value(value)
      .build()
}
