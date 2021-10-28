package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiCache {

  def apply(
    internalResourceId: String,
    transitEncryptionEnabled: Option[Boolean] = None,
    atRestEncryptionEnabled: Option[Boolean] = None,
    apiCachingBehavior: Option[String] = None,
    apiId: Option[String] = None,
    ttl: Option[Number] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnApiCache =
    software.amazon.awscdk.services.appsync.CfnApiCache.Builder
      .create(stackCtx, internalResourceId)
      .transitEncryptionEnabled(transitEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .atRestEncryptionEnabled(atRestEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .apiCachingBehavior(apiCachingBehavior.orNull)
      .apiId(apiId.orNull)
      .ttl(ttl.orNull)
      .`type`(`type`.orNull)
      .build()
}
