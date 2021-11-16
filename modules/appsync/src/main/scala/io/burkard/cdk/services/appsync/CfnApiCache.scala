package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiCache {

  def apply(
    internalResourceId: String,
    apiCachingBehavior: String,
    apiId: String,
    ttl: Number,
    `type`: String,
    transitEncryptionEnabled: Option[Boolean] = None,
    atRestEncryptionEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnApiCache =
    software.amazon.awscdk.services.appsync.CfnApiCache.Builder
      .create(stackCtx, internalResourceId)
      .apiCachingBehavior(apiCachingBehavior)
      .apiId(apiId)
      .ttl(ttl)
      .`type`(`type`)
      .transitEncryptionEnabled(transitEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .atRestEncryptionEnabled(atRestEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
