package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatastorePartitionsProperty {

  def apply(
    partitions: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty.Builder)
      .partitions(partitions.map(_.asJava).orNull)
      .build()
}
