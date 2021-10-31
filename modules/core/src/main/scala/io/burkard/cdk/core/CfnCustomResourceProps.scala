package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomResourceProps {

  def apply(
    serviceToken: Option[String] = None
  ): software.amazon.awscdk.CfnCustomResourceProps =
    (new software.amazon.awscdk.CfnCustomResourceProps.Builder)
      .serviceToken(serviceToken.orNull)
      .build()
}
