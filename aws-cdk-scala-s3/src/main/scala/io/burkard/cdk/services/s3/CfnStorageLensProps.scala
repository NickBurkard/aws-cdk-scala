package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStorageLensProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    storageLensConfiguration: Option[software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLensProps =
    (new software.amazon.awscdk.services.s3.CfnStorageLensProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .storageLensConfiguration(storageLensConfiguration.orNull)
      .build()
}
