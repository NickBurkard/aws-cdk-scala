package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiCacheProps {

  def apply(
    apiCachingBehavior: String,
    apiId: String,
    ttl: Number,
    `type`: String,
    transitEncryptionEnabled: Option[Boolean] = None,
    atRestEncryptionEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.appsync.CfnApiCacheProps =
    (new software.amazon.awscdk.services.appsync.CfnApiCacheProps.Builder)
      .apiCachingBehavior(apiCachingBehavior)
      .apiId(apiId)
      .ttl(ttl)
      .`type`(`type`)
      .transitEncryptionEnabled(transitEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .atRestEncryptionEnabled(atRestEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
