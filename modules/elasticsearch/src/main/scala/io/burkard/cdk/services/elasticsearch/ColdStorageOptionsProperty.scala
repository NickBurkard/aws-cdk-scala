package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColdStorageOptionsProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
