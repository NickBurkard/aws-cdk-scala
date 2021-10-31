package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SslPropertiesProperty {

  def apply(
    disableSsl: Option[Boolean] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty.Builder)
      .disableSsl(disableSsl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
