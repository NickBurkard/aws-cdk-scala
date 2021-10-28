package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiCacheProps {

  def apply(
    transitEncryptionEnabled: Option[Boolean] = None,
    atRestEncryptionEnabled: Option[Boolean] = None,
    apiCachingBehavior: Option[String] = None,
    apiId: Option[String] = None,
    ttl: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnApiCacheProps =
    (new software.amazon.awscdk.services.appsync.CfnApiCacheProps.Builder)
      .transitEncryptionEnabled(transitEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .atRestEncryptionEnabled(atRestEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .apiCachingBehavior(apiCachingBehavior.orNull)
      .apiId(apiId.orNull)
      .ttl(ttl.orNull)
      .`type`(`type`.orNull)
      .build()
}
