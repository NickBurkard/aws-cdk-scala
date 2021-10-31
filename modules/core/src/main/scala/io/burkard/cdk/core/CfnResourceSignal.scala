package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSignal {

  def apply(
    count: Option[Number] = None,
    timeout: Option[String] = None
  ): software.amazon.awscdk.CfnResourceSignal =
    (new software.amazon.awscdk.CfnResourceSignal.Builder)
      .count(count.orNull)
      .timeout(timeout.orNull)
      .build()
}
