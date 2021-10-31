package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
