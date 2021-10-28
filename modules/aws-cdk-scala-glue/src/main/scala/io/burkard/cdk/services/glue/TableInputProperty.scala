package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TableInputProperty {

  def apply(
    tableType: Option[String] = None,
    name: Option[String] = None,
    viewExpandedText: Option[String] = None,
    description: Option[String] = None,
    viewOriginalText: Option[String] = None,
    retention: Option[Number] = None,
    owner: Option[String] = None,
    targetTable: Option[software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty] = None,
    parameters: Option[AnyRef] = None,
    storageDescriptor: Option[software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty] = None,
    partitionKeys: Option[List[_]] = None
  ): software.amazon.awscdk.services.glue.CfnTable.TableInputProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.TableInputProperty.Builder)
      .tableType(tableType.orNull)
      .name(name.orNull)
      .viewExpandedText(viewExpandedText.orNull)
      .description(description.orNull)
      .viewOriginalText(viewOriginalText.orNull)
      .retention(retention.orNull)
      .owner(owner.orNull)
      .targetTable(targetTable.orNull)
      .parameters(parameters.orNull)
      .storageDescriptor(storageDescriptor.orNull)
      .partitionKeys(partitionKeys.map(_.asJava).orNull)
      .build()
}
