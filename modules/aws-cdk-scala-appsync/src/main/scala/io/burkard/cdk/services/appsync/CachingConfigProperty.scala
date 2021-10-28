package io.burkard.cdk.services.appsync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CachingConfigProperty {

  def apply(
    cachingKeys: Option[List[String]] = None,
    ttl: Option[Number] = None
  ): software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnResolver.CachingConfigProperty.Builder)
      .cachingKeys(cachingKeys.map(_.asJava).orNull)
      .ttl(ttl.orNull)
      .build()
}
