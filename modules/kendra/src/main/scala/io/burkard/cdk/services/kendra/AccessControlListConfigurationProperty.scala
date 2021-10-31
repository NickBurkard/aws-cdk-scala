package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessControlListConfigurationProperty {

  def apply(
    keyPath: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty.Builder)
      .keyPath(keyPath.orNull)
      .build()
}
